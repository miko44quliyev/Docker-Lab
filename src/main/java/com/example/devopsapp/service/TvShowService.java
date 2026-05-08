package com.example.devopsapp.service;


import com.example.devopsapp.entity.TvShow;
import com.example.devopsapp.repository.TvShowRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TvShowService {

    private final TvShowRepository tvShowRepository;

    public TvShowService(TvShowRepository tvShowRepository) {
        this.tvShowRepository = tvShowRepository;
    }

    public List<TvShow> getAllTvShows() {
        return tvShowRepository.findAll();
    }
}