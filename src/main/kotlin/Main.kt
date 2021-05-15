package kcoin

fun main(args: Array<String>) {

    val genesisBlock = Block(previousHash = "0", data = "I'm the first")
    val secondBlock = Block(genesisBlock.hash, "I'm the second")
    val thirdBlock = Block(secondBlock.hash, "I'm the third")


    val blockchain: Blockchain = Blockchain()
    blockchain.add(genesisBlock)
    blockchain.add(secondBlock)
    blockchain.add(thirdBlock)

}
