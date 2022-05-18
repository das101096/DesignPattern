package CreationalPatterns.Builder;

public class SmartPhone {
    private String CPU, RAM, OS, A;

    public static class Builder {
        // 필수 변수
        private String CPU, RAM, OS;

        // 필수가 아닌 변수
        private String A;

        // 필수 변수들은 생성자 생성시 초기화
        public Builder(String CPU, String RAM, String OS) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.OS = OS;
        }

        public Builder setA(String A){
            this.A = A;
            return this;
        }

        // 필수 변수가 아닐 경우 메서드를 구성하여 파이프라이닝
        public SmartPhone build() {
            return new SmartPhone(this);
        }
    }

    private SmartPhone(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.OS = builder.OS;
        this.A = builder.A;
    }
}
