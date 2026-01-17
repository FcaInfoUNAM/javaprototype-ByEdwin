public class Main {
    public static void main(String[] args) {
        // Medir el tiempo de creación del primer objeto (costoso)
        long t0 = System.currentTimeMillis();
        GraphicElement button1 = new GraphicElement("Rectangle", "Blue", 10, 20);
        long t1 = System.currentTimeMillis();

        // Crear el segundo objeto por clonación (rápido)
        long t2 = System.currentTimeMillis();
        GraphicElement button2 = button1.clone();
        button2.setX(40);
        button2.setY(60);
        long t3 = System.currentTimeMillis();

        System.out.println("Prototype demo:");
        System.out.println("button1 = " + button1);
        System.out.println("button2 = " + button2);
        System.out.println("Tiempo constructor: " + (t1 - t0) + " ms");
        System.out.println("Tiempo clonación: " + (t3 - t2) + " ms");

        // Singleton demo
        AppConfig config1 = AppConfig.getInstance();
        AppConfig config2 = AppConfig.getInstance();

        // Cambiar una configuración y demostrar unicidad
        config1.setTheme("Dark");
        System.out.println("Singleton demo:");
        System.out.println("config1 == config2 ? " + (config1 == config2));
        System.out.println("Tema actual desde config2: " + config2.getTheme());
    }
}