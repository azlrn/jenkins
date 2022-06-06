try{
    value = divide(1)
    println(value)
}
catch(ex){
    //println(ex);
    /*def frames = ex.getStackTrace().toString().split(',');
    for(frame in frames){
        println(frame);
    }*/
    value=0
    println(value)
}

BigDecimal divide (int x){
    int y = x/0;
    return y;
}