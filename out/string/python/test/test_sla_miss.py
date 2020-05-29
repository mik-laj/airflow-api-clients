# coding: utf-8

"""
    Airflow API (Stable)

    Apache Airflow management API.  # noqa: E501

    The version of the OpenAPI document: 1.0.0
    Contact: dev@airflow.apache.org
    Generated by: https://openapi-generator.tech
"""


from __future__ import absolute_import

import unittest
import datetime

import airflow_client
from airflow_client.models.sla_miss import SLAMiss  # noqa: E501
from airflow_client.rest import ApiException

class TestSLAMiss(unittest.TestCase):
    """SLAMiss unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional):
        """Test SLAMiss
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # model = airflow_client.models.sla_miss.SLAMiss()  # noqa: E501
        if include_optional :
            return SLAMiss(
                task_id = '0', 
                dag_id = '0', 
                execution_date = '0', 
                email_sent = True, 
                timestamp = '0', 
                description = '0', 
                notification_sent = True
            )
        else :
            return SLAMiss(
        )

    def testSLAMiss(self):
        """Test SLAMiss"""
        inst_req_only = self.make_instance(include_optional=False)
        inst_req_and_optional = self.make_instance(include_optional=True)


if __name__ == '__main__':
    unittest.main()
