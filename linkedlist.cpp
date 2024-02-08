//total node = 10000, 0 to 9999.
//Initialize them to -1
int head[10000];
//total edge 100000
int data[100000], next[100000];
//global variable has initial value of 0

int id;
//add node y in the list of x
void insert(int x, int y)
{
    data[id] = y;
    next[id] = head[x];
    head[x] = id;
    id++;
}
//erase first node from head of x
void erase(int x)
{
    //if you are not sure if the linked
    //list is empty, check head[x] == -1?
    head[x] = next[head[x]];

}
//search node y in the list of x
int search(int x, int y)
{
    for(int p = head[x]; p != -1; p = next[p])
        if(data[p] == y)
            return 1; //found
    return 0; //not found
}
