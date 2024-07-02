import java.util.*;
//hashmap doesnot have order
public class HashMapCode {
static class HashMap<K,V> { //generics
    //V and K is used if we don't know datatype
private class Node {
K key;
V value;

public Node(K key, V value) {
this.key = key;
this.value = value;
}
}
private int n; //n - nodes
private int N; //N - buckets
private LinkedList<Node> buckets[]; //N = buckets.length
@SuppressWarnings("unchecked")
public HashMap() {
this.N = 4;
this.buckets = new LinkedList[4];
for(int i=0; i<4; i++) {
this.buckets[i] = new LinkedList<>();
//create empty linklist
}
}

private int hashFunction(K key) {
int bi = key.hashCode();
//java has hashcode fn and we called it here
//we change key by hashcode and return int value
return Math.abs(bi) % N;
//change -ve to +ve by math.abs(bi)
//and %N is used to limit bi from 0 to N-1
}

private int searchInLL(K key, int bi) {
LinkedList<Node> ll = buckets[bi];
//save LL in BUCKET
for(int i=0; i<ll.size(); i++) {
if(ll.get(i).key == key) {
return i; //di
}
}

return -1;
}

@SuppressWarnings("unchecked")
//to counter unwanted linkedlist error we use it
private void rehash() {
LinkedList<Node> oldBucket[] = buckets;
//store old data in bucket
buckets = new LinkedList[N*2];
//this loop is used to bring data from
//old bucket and put in new bucket
for(int i=0; i<N*2; i++) {
buckets[i] = new LinkedList<>();
//create new linked list
}
for(int i=0; i<oldBucket.length; i++) {
LinkedList<Node> ll = oldBucket[i];
for(int j=0; j<ll.size(); j++) {
Node node = ll.get(j);
put(node.key, node.value);
}
}
}

public void put(K key, V value) {
int bi = hashFunction(key); 
//hashfn is fn that exit that take key and return bucketindex
int di = searchInLL(key, bi); //di = -1
//after bucket index we need data index so
//search fn in linkedlist is used
if(di == -1) { //id di == -1 key doesn't exist
buckets[bi].add(new Node(key, value));
//go to bucket index in bucket and add new node with key and 
//value
n++;
} else { //key exists
Node node = buckets[bi].get(di);
node.value = value;
}
double lambda = (double)n/N;

if(lambda > 2.0) {
rehash();
}
}

public boolean containsKey(K key) {
int bi = hashFunction(key);
int di = searchInLL(key, bi); //di = -1
if(di == -1) { //key doesn't exist
return false;
} else { //key exists
return true;
}
}

public V remove(K key) {
int bi = hashFunction(key);
int di = searchInLL(key, bi); //di = -1
if(di == -1) { //key doesn't exist
return null;
} else { //key exists
Node node = buckets[bi].remove(di);
n--;
return node.value;
}
}

public V get(K key) {
int bi = hashFunction(key);
int di = searchInLL(key, bi); //di = -1
if(di == -1) { //key doesn't exist
return null;
} else { //key exists
Node node = buckets[bi].get(di);
return node.value;
}
}

public ArrayList<K> keySet() {
ArrayList<K> keys = new ArrayList<>();
//create arraylist
for(int i=0; i<buckets.length; i++) { //bi
LinkedList<Node> ll = buckets[i];
for(int j=0; j<ll.size(); j++) { //di
Node node = ll.get(j);
keys.add(node.key);
}
}
return keys;
}
public boolean isEmpty() {
return n == 0;
}
}
public static void main(String args[]) {
HashMap<String, Integer> map = new HashMap<>();
map.put("India", 190);
map.put("China", 200);
map.put("US", 50);
ArrayList<String> keys = map.keySet();
//return all keyset
for(int i=0; i<keys.size(); i++) {
System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
}
map.remove("India");
System.out.println(map.get("India"));
}
}

