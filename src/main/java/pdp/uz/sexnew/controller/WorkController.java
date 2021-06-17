package pdp.uz.sexnew.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pdp.uz.sexnew.entity.Mebels;
import pdp.uz.sexnew.entity.Price;
import pdp.uz.sexnew.entity.User;
import pdp.uz.sexnew.entity.Work;
import pdp.uz.sexnew.payload.WorkDto;
import pdp.uz.sexnew.repository.MebelsRepository;
import pdp.uz.sexnew.repository.PriceRepository;
import pdp.uz.sexnew.repository.UserRepository;
import pdp.uz.sexnew.repository.WorkRepository;

import java.util.Optional;

@RestController
@RequestMapping("/worker")
public class WorkController {
    @Autowired
    UserRepository userRepository;
    @Autowired
    MebelsRepository mebelsRepository;
    @Autowired
    PriceRepository priceRepository;
    @Autowired
    WorkRepository workRepository;


    @PostMapping
    public HttpEntity<?> add(@RequestBody WorkDto workDto) {
        Work work = new Work();
        Optional<User> optionalWork = userRepository.findById(workDto.getWorker());
        Optional<User> optionalWork1 = userRepository.findById(workDto.getClient());
        Optional<Price> optionalPrice = priceRepository.findById(workDto.getPrice());
        Optional<Mebels> optionalMebels = mebelsRepository.findById(workDto.getMebels());
        boolean extists = optionalMebels.isPresent() || optionalPrice.isPresent() || optionalWork.isPresent() || optionalWork1.isPresent();
        if (!extists) {
            return ResponseEntity.badRequest().body("nmadir not found!!!");
        }

        work.setWorker(optionalWork.get());
        work.setClient(optionalWork1.get());
        work.setMebels(optionalMebels.get());
        work.setPrice(optionalPrice.get());

        workRepository.save(work);
        return ResponseEntity.ok("Work jurnali saqlandi!!!");

    }

}
