package com.mytube;

public class VideoProcessor {

    private VideoDatabase database;
    private VideoEncoder encoder;
    private EmailService emailService;

    public VideoProcessor(VideoDatabase database,
                          VideoEncoder encoder,
                          EmailService emailService) {
        this.database = database;
        this.emailService = emailService;
        this.encoder = encoder;
    }


    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        emailService.sendEmail(video.getUser());
    }
}

