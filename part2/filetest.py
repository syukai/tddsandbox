# Part3 - chapter29
from TestCase import TestCase
class FileTest(TestCase):
    def setUp(self):
        self.file = File("foobar").open()
    def testMethod(self):
        # run test
        pass
    def tearDown(self):
        self.file.close()
