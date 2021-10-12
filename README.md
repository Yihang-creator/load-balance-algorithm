# load-balance-algorithm


Smooth weighted round-robin algorithm 

we have initial weights assigned to each IP address : initWeight: [w1,w2,w3,...]

we have current weights assigned to each IP address : currWeight: [cw1,cw2,cw3,...] 
currWeight has a default value of [0,0,0,...]

Each time we need to choose one server from our server pool

1. add entries in initWeight to the corresponding entries to currWeight
2. choose the IP address with the maximum weight in currWeight
3. subtract total weights of initWeight from the weight of the chosen IP

THe IP address chosen using this algorithm has a more sparse distribution, avoiding the problems in Weighted round-robin algorithm.
