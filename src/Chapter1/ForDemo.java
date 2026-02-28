class ForDemo{
    public static void main(String[] args){
        int count;

        for (count=0; count<=5; count++) // Here, (count++) means ---> count = count + 1
                                        // Similarly, (count--) means    ------> count = count - 1
            System.out.println("This is the count: "+ count);
        System.out.println("Done!");
    }
}