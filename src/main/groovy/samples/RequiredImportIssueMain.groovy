package samples

//import samples.RequiredImportIssueModel.StaticNested

class RequiredImportIssueMain {
    static void main(String[] args) {
        assert 'nested' == new RequiredImportIssueModel().with {
            // MissingPropertyException: No such property: StaticNested for class: samples.RequiredImportIssueModel
            // fails without import
            // to fix use commented import which 
            return StaticNested.msg

            // workaround with explicit notation
//            return RequiredImportIssueModel.StaticNested.msg
        }
    }
}
