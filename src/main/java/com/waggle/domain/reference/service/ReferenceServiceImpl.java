package com.waggle.domain.reference.service;

import com.waggle.domain.reference.entity.*;
import com.waggle.domain.reference.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReferenceServiceImpl implements ReferenceService {

    private final DurationOfWorkingRepository durationOfWorkingRepository;
    private final PortfolioUrlRepository portfolioUrlRepository;
    private final IndustrialRepository industrialRepository;
    private final JobRepository jobRepository;
    private final SkillRepository skillRepository;
    private final WaysOfWorkingRepository waysOfWorkingRepository;

    @Override
    public List<PortfolioUrl> getPortfolioUrls() {
        List<PortfolioUrl> portfolioUrls = portfolioUrlRepository.findAll();
        if (portfolioUrls.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return portfolioUrls;
    }

    @Override
    public List<Industrial> getIndustrials() {
        List<Industrial> industrials = industrialRepository.findAll();
        if (industrials.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return industrials;
    }

    @Override
    public List<Job> getJobs() {
        List<Job> jobs = jobRepository.findAll();
        if (jobs.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return jobs;
    }

    @Override
    public List<Skill> getSkills() {
        List<Skill> skills = skillRepository.findAll();
        if (skills.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return skills;
    }

    @Override
    public List<DurationOfWorking> getDurationOfWorkings() {
        List<DurationOfWorking> durationOfWorkings = durationOfWorkingRepository.findAll();
        if (durationOfWorkings.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return durationOfWorkings;
    }

    @Override
    public List<WaysOfWorking> getWaysOfWorkings() {
        List<WaysOfWorking> waysOfWorkings = waysOfWorkingRepository.findAll();
        if (waysOfWorkings.isEmpty()) {
            throw new EmptyResultDataAccessException(1);
        }
        return waysOfWorkings;
    }
}
