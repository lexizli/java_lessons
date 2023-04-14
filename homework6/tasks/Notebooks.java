package homework6.tasks;

import java.util.Objects;

public class Notebooks {
    public String tradeMark;
    public String model;
    public String os;
    public String resolution;
    public String cpuModel;
    public String videoType;
    public String videoModel;
    public double screenSize;
    public double width;
    public double height;
    public double length;
    public double price;
    public int frequency;
    public int cores;
    public int threads;
    public int memoryFrequency;
    public int memorySizeMb;
    public int ssdSizeMb;
    public int weightGramms;


    // private int id;
    // private String tradeMark;
    // private String model;
    // private String os;
    // private String resolution;
    // private String cpuModel;
    // private String videoType;
    // private String videoModel;
    // private double screenSize;
    // private double width;
    // private double height;
    // private double length;
    // private double price;
    // private int frequency;
    // private int cores;
    // private int threads;
    // private int memoryFrequency;
    // private int memorySizeMb;
    // private int ssdSizeMb;
    // private int weightGramms;

    // Конструктор класса
    public Notebooks( String tradeMark, String model, String os, String resolution, String cpuModel, 
                                    String videoType, String videoModel, double screenSize, double width, double height, double length, 
                                    double price, int frequency, int cores, int threads, int memoryFrequency, int memorySizeMb, 
                                    int ssdSizeMb, int weightGramms) {

        this.tradeMark = tradeMark;
        this.model = model;
        this.os = os;
        this.resolution = resolution;
        this.cpuModel = cpuModel;
        this.videoType = videoType;
        this.videoModel = videoModel;
        this.screenSize = screenSize;
        this.width = width;
        this.height = height;
        this.length = length;
        this.price = price;
        this.frequency = frequency;
        this.cores = cores;
        this.threads = threads;
        this.memoryFrequency = memoryFrequency;
        this.memorySizeMb = memorySizeMb;
        this.ssdSizeMb = ssdSizeMb;
        this.weightGramms = weightGramms;
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

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(float screenSize) {
        this.screenSize = screenSize;
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

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    public int getMemoryFrequency() {
        return memoryFrequency;
    }

    public void setMemoryFrequency(int memoryFrequency) {
        this.memoryFrequency = memoryFrequency;
    }

    public int getMemorySizeMb() {
        return memorySizeMb;
    }

    public void setMemorySizeMb(int memorySizeMb) {
        this.memorySizeMb = memorySizeMb;
    }

    public int getSsdSizeMb() {
        return ssdSizeMb;
    }

    public void setSsdSizeMb(int ssdSizeMb) {
        this.ssdSizeMb = ssdSizeMb;
    }

    public String getVideoType() {
        return videoType;
    }

    public void setVideoType(String videoType) {
        this.videoType = videoType;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String videoModel() {
        return videoModel;
    }

    public void videoModel(String videoModel) {
        this.videoModel = videoModel;
    }

    public int weightGramms() {
        return weightGramms;
    }

    public void weightGramms(int weightGramms) {
        this.weightGramms = weightGramms;
    }

    public double width() {
        return width;
    }

    public void width(float width) {
        this.width = width;
    }

    public double height() {
        return height;
    }

    public void height(float height) {
        this.width = height;
    }

    public double length() {
        return length;
    }

    public void length(float length) {
        this.width = length;
    }

    public double price() {
        return price;
    }

    public void price(float price) {
        this.price = price;
    }

    // Метод, возвращающий строковое представление объекта
    @Override
    public String toString() {
        return "Notebooks \n" +
                "tradeMark = " + tradeMark  +
                ", model = " + model + 
                ", screenSize = " + screenSize +
                ", resolution = " + resolution  +
                ", cpuModel = " + cpuModel  +
                ", frequency = " + frequency +
                ", cores = " + cores +
                ", threads = " + threads +
                ", memoryFrequency = " + memoryFrequency +
                ", memorySizeMb = " + memorySizeMb +
                ", ssdSizeMb = " + ssdSizeMb +
                ", videoType = " + videoType  +
                ", os = " + os +
                ", videoModel = " + videoModel  +
                ", weight, gramms = " + weightGramms  +
                ", width = " + width +
                ", height = " + height  +
                ", length = " + length  +
                ", price = " + price;
    }
    
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Notebooks)) return false;
            Notebooks notebooks = (Notebooks) o;
            return Double.compare(notebooks.screenSize, screenSize) == 0
                    && Double.compare(notebooks.width, width) == 0
                    && Double.compare(notebooks.height, height) == 0
                    && Double.compare(notebooks.length, length) == 0
                    && Double.compare(notebooks.price, price) == 0
                    && frequency == notebooks.frequency
                    && cores == notebooks.cores
                    && threads == notebooks.threads
                    && memoryFrequency == notebooks.memoryFrequency
                    && memorySizeMb == notebooks.memorySizeMb
                    && ssdSizeMb == notebooks.ssdSizeMb
                    && weightGramms == notebooks.weightGramms
                    && Objects.equals(tradeMark, notebooks.tradeMark)
                    && Objects.equals(model, notebooks.model)
                    && Objects.equals(os, notebooks.os)
                    && Objects.equals(resolution, notebooks.resolution)
                    && Objects.equals(cpuModel, notebooks.cpuModel)
                    && Objects.equals(videoType, notebooks.videoType)
                    && Objects.equals(videoModel, notebooks.videoModel);
        }
    
        @Override
        public int hashCode() {
            return Objects.hash(tradeMark, model, os, resolution, cpuModel, videoType, videoModel, screenSize,
                    width, height, length, price, frequency, cores, threads, memoryFrequency, memorySizeMb,  ssdSizeMb,  weightGramms);
        }
    }
    