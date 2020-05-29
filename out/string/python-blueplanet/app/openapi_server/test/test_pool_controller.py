# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.pool import Pool  # noqa: E501
from app.openapi_server.models.pool_collection import PoolCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestPoolController(BaseTestCase):
    """PoolController integration test stubs"""

    def test_create_pool(self):
        """Test case for create_pool

        Create a pool
        """
        body = {
  "queued_slots" : 5,
  "open_slots" : 5,
  "slots" : 0,
  "name" : "name",
  "used_slots" : 1,
  "occupied_slots" : 6
}
        response = self.client.open(
            '/api/v1/pools',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_pool(self):
        """Test case for delete_pool

        Delete a pool
        """
        response = self.client.open(
            '/api/v1/pools/{pool_name}'.format(pool_name='pool_name_example'),
            method='DELETE')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_pool(self):
        """Test case for get_pool

        Get a pool
        """
        response = self.client.open(
            '/api/v1/pools/{pool_name}'.format(pool_name='pool_name_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_pools(self):
        """Test case for get_pools

        Get all pools
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        response = self.client.open(
            '/api/v1/pools',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_pool(self):
        """Test case for update_pool

        Update a pool
        """
        body = {
  "queued_slots" : 5,
  "open_slots" : 5,
  "slots" : 0,
  "name" : "name",
  "used_slots" : 1,
  "occupied_slots" : 6
}
        query_string = [('update_mask', 'update_mask_example')]
        response = self.client.open(
            '/api/v1/pools/{pool_name}'.format(pool_name='pool_name_example'),
            method='PATCH',
            data=json.dumps(body),
            content_type='application/json',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
