package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Controllers;


import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guess-number/matches")
public class MatchController {

    @Autowired

    public MatchService matchService;
}
