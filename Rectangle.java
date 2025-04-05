class Rectangle {
    int height;
    int width;
    
    // Default constructor
    Rectangle() {
        height = 2;
        width = 2;
    }
    
    // Parameterized constructor
    Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        System.out.println("Just created a rectangle object with size (h*w): " + height + "*" + width);
        print(width, height);
    }

    // Method to print details of the rectangle
    void get_details() {
        System.out.println("Height: " + height + ", Width: " + width);
    }

    // Method to print the rectangle with stars
    void print(int width, int height) {
        for (int i = 0; i < height; i++) { // For lines (height)
            for (int j = 0; j < width; j++) { // For stars (width)
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}

class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 3);
        Rectangle r2 = new Rectangle(3, 6);
        r1.height = 10;
        r1.width = 20;
        Rectangle r3 = r1;

        r1.get_details();
        r2.get_details();
        r3.get_details();
    }
}
