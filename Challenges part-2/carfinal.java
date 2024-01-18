 class carfinal {
    final int noofwheel;
    final String model;
    final String engineinliter;

    carfinal(int noofwheel,String model,String engineinliter){
        this.noofwheel=noofwheel;
        this.model=model;
        this.engineinliter=engineinliter;
    }
    
    public static void main(String[] args) {
        carfinal suzuki=new carfinal(4,"toyota","2ml");
    }
}
