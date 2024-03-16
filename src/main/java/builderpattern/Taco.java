package builderpattern;

import java.util.Arrays;
import java.util.List;

public class Taco {
    private String size;
    private String sauceType;
    private List<String> fillings;

    private Taco(TacoBuilder builder) {
        this.size = builder.size;
        this.sauceType = builder.sauceType;
        this.fillings = builder.fillings;
    }

    public String getSize() {
        return size;
    }

    public String getSauceType() {
        return sauceType;
    }

    public List<String> getFillings() {
        return fillings;
    }

    @Override
    public String toString() {
        return "Taco Size is " + this.size + " And The sauce is " + this.sauceType + " And the fillings are " + this.fillings;
    }



    public static class TacoBuilder {
        private String size;
        private String sauceType;
        private List<String> fillings;

        public TacoBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public TacoBuilder setSauceType(String sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        public TacoBuilder setFillings(List<String> fillings) {
            this.fillings = fillings;
            return this;
        }

        public Taco build() {
            return new Taco(this);
        }
        
   
    }
    
    public static void main(String[] args) {
        Taco taco = new Taco.TacoBuilder()
                .setSize("Large")
                .setSauceType("Buffalo sauce")
                .setFillings(Arrays.asList("Chicken" , "Cheese"))
                .build();
        System.out.println(taco);
    }
  
}
