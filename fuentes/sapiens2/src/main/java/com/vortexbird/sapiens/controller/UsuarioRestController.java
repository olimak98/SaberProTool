package com.vortexbird.sapiens.controller;

import com.vortexbird.sapiens.domain.*;
import com.vortexbird.sapiens.dto.UsuarioDTO;
import com.vortexbird.sapiens.mapper.UsuarioMapper;
import com.vortexbird.sapiens.service.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/usuario")
@CrossOrigin(origins = "*")
public class UsuarioRestController {
    private static final Logger log = LoggerFactory.getLogger(UsuarioRestController.class);
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UsuarioMapper usuarioMapper;

    @GetMapping(value = "/findById/{usuaId}")
    public ResponseEntity<?> findById(@PathVariable("usuaId")
    Integer usuaId) {
        log.debug("Request to findById() Usuario");

        try {
            Usuario usuario = usuarioService.findById(usuaId).get();

            return ResponseEntity.ok()
                                 .body(usuarioMapper.usuarioToUsuarioDTO(
                    usuario));
        } catch (Exception e) {
            log.error(e.getMessage(), e);

            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping(value = "/findAll")
    public ResponseEntity<?> findAll() {
        log.debug("Request to findAll() Usuario");

        try {
            return ResponseEntity.ok()
                                 .body(usuarioMapper.listUsuarioToListUsuarioDTO(
                    usuarioService.findAll()));
        } catch (Exception e) {
            log.error(e.getMessage(), e);

            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PostMapping(value = "/save")
    public ResponseEntity<?> save(@RequestBody
    UsuarioDTO usuarioDTO) {
        log.debug("Request to save Usuario: {}", usuarioDTO);

        try {
            Usuario usuario = usuarioMapper.usuarioDTOToUsuario(usuarioDTO);
            usuario = usuarioService.save(usuario);

            return ResponseEntity.ok()
                                 .body(usuarioMapper.usuarioToUsuarioDTO(
                    usuario));
        } catch (Exception e) {
            log.error(e.getMessage(), e);

            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PutMapping(value = "/update")
    public ResponseEntity<?> update(@RequestBody
    UsuarioDTO usuarioDTO) {
        log.debug("Request to update Usuario: {}", usuarioDTO);

        try {
            Usuario usuario = usuarioMapper.usuarioDTOToUsuario(usuarioDTO);
            usuario = usuarioService.update(usuario);

            return ResponseEntity.ok()
                                 .body(usuarioMapper.usuarioToUsuarioDTO(
                    usuario));
        } catch (Exception e) {
            log.error(e.getMessage(), e);

            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @DeleteMapping(value = "/delete/{usuaId}")
    public ResponseEntity<?> delete(@PathVariable("usuaId")
    Integer usuaId) throws Exception {
        log.debug("Request to delete Usuario");

        try {
            Usuario usuario = usuarioService.findById(usuaId).get();

            usuarioService.delete(usuario);

            return ResponseEntity.ok().build();
        } catch (Exception e) {
            log.error(e.getMessage(), e);

            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @GetMapping(value = "/count")
    public ResponseEntity<?> count() {
        return ResponseEntity.ok().body(usuarioService.count());
    }
}
