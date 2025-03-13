package labexperiments;

class Products{
    int pcode;
    String pname;
    double price;

    public Products(int pcode,String pname,double price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }

    public void displayProduct(){
        System.out.println("Product Code: " +pcode);
        System.out.println("Product Name: " +pname);
        System.out.println("Product Price: " +price);
        System.out.println();
    }

    public static void main(String args[]){
        Products product1=new Products(101,"Rice",25);
        Products product2=new Products(102,"Wheat",15);
        Products product3=new Products(103,"Corn",30);
        Products lpp=product1;
        if (product2.price < lpp.price) {
            lpp = product2;
        }
        if (product3.price < lpp.price) {
            lpp = product3;
        }

        System.out.println("Product with the lowest price:");
        lpp.displayProduct();
    }
}

