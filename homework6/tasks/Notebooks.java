package homework6.tasks;

import java.util.Objects;

public class Notebooks {
    private String tradeMark;
    private String model;
    private String os;
    private String resolution;
    private String cpuModel;
    private String videoType;
    private String videoModel;
    private String color;

    // Конструктор класса
    public Notebooks(String tradeMark, String model, String os, String resolution, String cpuModel,
            String videoType, String videoModel, String color) {

        this.tradeMark = tradeMark;
        this.model = model;
        this.os = os;
        this.resolution = resolution;
        this.cpuModel = cpuModel;
        this.videoType = videoType;
        this.videoModel = videoModel;
        this.color = color;
    }

    // Геттеры и сеттеры для всех полей класса

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCpuModel() {
        return cpuModel;
    }

    public void setCpuModel(String cpuModel) {
        this.cpuModel = cpuModel;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getVideoModel() {
        return videoModel;
    }

    public void setVideoModel(String videoModel) {
        this.videoModel = videoModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Метод, возвращающий строковое представление объекта
    @Override
    public String toString() {
        return "Notebooks \n" +
                "tradeMark = " + tradeMark +
                ", model = " + model +
                ", resolution = " + resolution +
                ", cpuModel = " + cpuModel +
                ", videoType = " + videoType +
                ", videoModel = " + videoModel +
                ", color = " + color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Notebooks))
            return false;
        Notebooks notebooks = (Notebooks) o;
        return Objects.equals(tradeMark, notebooks.tradeMark)
                && Objects.equals(model, notebooks.model)
                && Objects.equals(os, notebooks.os)
                && Objects.equals(resolution, notebooks.resolution)
                && Objects.equals(cpuModel, notebooks.cpuModel)
                && Objects.equals(videoType, notebooks.videoType)
                && Objects.equals(videoModel, notebooks.videoModel)
                && Objects.equals(color, notebooks.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tradeMark, model, os, resolution, cpuModel, videoType, videoModel, color);
    }

}
