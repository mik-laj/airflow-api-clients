# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.event_log import EventLog  # noqa: E501
from app.openapi_server.models.event_log_collection import EventLogCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestEventLogController(BaseTestCase):
    """EventLogController integration test stubs"""

    def test_get_event_log(self):
        """Test case for get_event_log

        Get all log entries from event log
        """
        query_string = [('limit', 100),
                        ('offset', 1)]
        response = self.client.open(
            '/api/v1/eventLogs',
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_event_log_entry(self):
        """Test case for get_event_log_entry

        Get a log entry
        """
        response = self.client.open(
            '/api/v1/eventLogs/{event_log_id}'.format(event_log_id=56),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
