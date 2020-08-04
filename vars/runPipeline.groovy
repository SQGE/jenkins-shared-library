#!groovy
def call() {

    node{
    
       stage('Checkout') {
            checkout scm
        }
    
        def cfg = pipelineCfg()
        println cfg 
        println(cfg.type)
        
        switch(cfg.type) {
            case "python": 
                println("python")
                pythonPipeline(cfg)
                break
            case "nodejs":
                nodejsPipeline(cfg)
                break
        }
    }
}
