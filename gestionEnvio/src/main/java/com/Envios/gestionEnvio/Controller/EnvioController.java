package com.Envios.gestionEnvio.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Envios.gestionEnvio.Model.Envio;
import com.Envios.gestionEnvio.Service.EnvioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping ("/api/envios")

public class EnvioController {

@Autowired
private EnvioService envioService;

@PostMapping
public Envio crearEnvio(@RequestBody Envio envio) {
    return envioService.crearEnvio(envio);
}

// GET - Obtener todos los envíos
@GetMapping
public List<Envio> obtenerTodos() {
    return envioService.obtenerTodos();
}

// GET - Obtener un envío por su ID
@GetMapping("/{id}")
public Envio obtenerPorId(@PathVariable Long id) {
    return envioService.obtenerPorId(id);
}

// PUT - Actualizar un envío existente
@PutMapping("/{id}")
public Envio actualizarEnvio(@PathVariable Long id, @RequestBody Envio envio) {
    return envioService.actualizarEnvio(id, envio);
}

// DELETE - Eliminar un envío
@DeleteMapping("/{id}")
public void eliminarEnvio(@PathVariable Long id) {
envioService.eliminarEnvio(id);
}

}

