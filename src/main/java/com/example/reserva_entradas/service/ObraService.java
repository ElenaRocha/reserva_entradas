package com.example.reserva_entradas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reserva_entradas.model.Obra;
import com.example.reserva_entradas.repository.ObraRepository;

@Service
public class ObraService {
    private final ObraRepository obraRepository;

    @Autowired
    public ObraService(ObraRepository obraRepository){
        this.obraRepository = obraRepository;
    }

    public List<Obra> getAllObras(){
        return obraRepository.findAll();
    }

    public Optional<Obra> getObraById(Long idobra){
        return obraRepository.findById(idobra);
    }

    public List<Obra> getObraByTeatro(Long idteatro){
        return obraRepository.findByTeatroId(idteatro);
    }

    public Obra saveObra(Obra obra){
        return obraRepository.save(obra);
    }

    public void deleteObra(Long idobra){
        obraRepository.deleteById(idobra);
    }
 }



//ejemplo de un servcio establecido como interfaz, acompañado de la clase que lo implementa
// import java.util.List;
// import java.util.Optional;

// import com.example.reserva_entradas.model.Obra;

// public interface ObraService {
//     List<Obra> getAllObras();

//     Optional<Obra> getObraById(Long idobra);

//     List<Obra> getObraByTeatro(Long teatro_id);

//     Obra saveObra(Obra obra);

//     void deleteObra(Long idobra);
// }



// package com.example.reserva_entradas.service;

// import java.util.List;
// import java.util.Optional;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.reserva_entradas.model.Obra;
// import com.example.reserva_entradas.repository.ObraRepository;

// @Service
// public class ObraServiceImpl implements ObraService{

//     @Autowired
//     private ObraRepository obraRepository;

//     @Override
//     public List<Obra> getAllObras() {
//         return obraRepository.findAll();
//     }

//     @Override
//     public Optional<Obra> getObraById(Long idobra) {
//         return obraRepository.findById(idobra);
//     }

//     @Override
//     public List<Obra> getObraByTeatro(Long teatro_id) {
//         return obraRepository.findByTeatroId(teatro_id);
//     }

//     @Override
//     public Obra saveObra(Obra obra) {
//         return obraRepository.save(obra);
//     }

//     @Override
//     public void deleteObra(Long idobra) {
//         obraRepository.deleteById(idobra);
//     }
    
// }