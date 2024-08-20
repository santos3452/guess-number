package ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.impl;

import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Repositories.MatchRepository;
import ar.edu.utn.frc.tup.lc.iii.scaffolnding.Services.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    private MatchRepository matchRepository;

}
