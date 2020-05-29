# coding: utf-8

from __future__ import absolute_import
import unittest

from flask import json
from six import BytesIO

from openapi_server.models.config import Config  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.test import BaseTestCase


class TestConfigController(BaseTestCase):
    """ConfigController integration test stubs"""

    def test_get_config(self):
        """Test case for get_config

        Get current configuration
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        headers = { 
            'Accept': 'application/json',
        }
        response = self.client.open(
            '/api/v1/config',
            method='GET',
            headers=headers,
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    unittest.main()
