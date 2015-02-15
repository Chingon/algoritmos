object Insertion{
	
def main(args:Array[String]){

var A=Array(6,5,3,1,8,7,2,4)
var n=7
var aux=0
var j=0

for( i<-1 to 7) {
j= i
while( j > 0 && A(j-1) > A(j) ) {
aux =A(j)
A(j)=A(j-1)
A(j-1)=aux
j=j-1
}
}

println("El vector es:")
for(i<-0 to 7){
print(A(i)+" ");
}

}
}