package com.cloud.a外观模式;

/**
 * @author ByondCloud
 * @version 1.0
 * @Date 2023/1/20
 * @Time 17:49
 */
public class HomeTheaterFacade {

    // 定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getTheaterLight();
        this.popcorn = Popcorn.getPopcorn();
        this.stereo = Stereo.getStereo();
        this.projector = Projector.getProjector();
        this.screen = Screen.getScreen();
        this.dvdPlayer = DVDPlayer.getDvdPlayer();
    }

    // 操作分成4步骤
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.off();
        stereo.on();
        dvdPlayer.on();
        theaterLight.down();
    }

    public void play() {
        dvdPlayer.play();
    }

    public void pause() {
        dvdPlayer.pause();
    }

    public void end() {
        theaterLight.off();
        popcorn.off();
        stereo.off();
        projector.off();
        screen.up();
        dvdPlayer.off();
    }
}
