// def call(String type,Map map) {

def call(Map map) {

    if ("${map.type}" == 'python' ) {
        pipeline {
            
            agent { node { label "${map.node}" }}
            
            //步骤设置
            stages {

                stage('checkout') {
                    steps {
                        script{
                            println "${map.type}"
                            println "${map.node}"
                            
                            println("checkout")
                    
                        }
                    }
                }
                
                stage('build') {
                    steps {
                        script{
                            
                            println("build")                            
                    
                        }
                    }
                }

                stage('deploy') {
                    steps {
                        script{

                            println("deploy")
                    
                        }
                    }
                }
            }
        }
    }
}
