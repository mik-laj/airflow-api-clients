# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from app.openapi_server.models.error import Error  # noqa: E501
from app.openapi_server.models.extra_link_collection import ExtraLinkCollection  # noqa: E501
from app.openapi_server.models.inline_response200 import InlineResponse200  # noqa: E501
from app.openapi_server.models.list_task_instance_form import ListTaskInstanceForm  # noqa: E501
from app.openapi_server.models.task_instance import TaskInstance  # noqa: E501
from app.openapi_server.models.task_instance_collection import TaskInstanceCollection  # noqa: E501
from openapi_server.test import BaseTestCase


class TestTaskInstanceController(BaseTestCase):
    """TaskInstanceController integration test stubs"""

    def test_get_extra_links(self):
        """Test case for get_extra_links

        Get extra links for task instance
        """
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/links'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_logs(self):
        """Test case for get_logs

        Get logs for a task instance
        """
        query_string = [('full_content', True),
                        ('token', 'token_example')]
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}/logs/{task_try_number}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example', task_try_number=56),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task_instance(self):
        """Test case for get_task_instance

        Get a task instance
        """
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances/{task_id}'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example', task_id='task_id_example'),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task_instances(self):
        """Test case for get_task_instances

        Get a list of task instance of DAG.
        """
        query_string = [('execution_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('execution_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('start_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_gte', '2013-10-20T19:20:30+01:00'),
                        ('end_date_lte', '2013-10-20T19:20:30+01:00'),
                        ('duration_gte', 3.4),
                        ('duration_lte', 3.4),
                        ('state', 'state_example'),
                        ('pool', 'pool_example'),
                        ('queue', 'queue_example'),
                        ('limit', 100),
                        ('offset', 1)]
        response = self.client.open(
            '/api/v1/dags/{dag_id}/dagRuns/{dag_run_id}/taskInstances'.format(dag_id='dag_id_example', dag_run_id='dag_run_id_example'),
            method='GET',
            query_string=query_string)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_task_instances_batch(self):
        """Test case for get_task_instances_batch

        Get list of task instances from all DAGs and DAG Runs.
        """
        body = {
  "start_date_gte" : "2000-01-23T04:56:07.000+00:00",
  "end_date_lte" : "2000-01-23T04:56:07.000+00:00",
  "execution_date_gte" : "2000-01-23T04:56:07.000+00:00",
  "duration_gte" : 0.8008281904610115,
  "State" : [ "State", "State" ],
  "execution_date_lte" : "2000-01-23T04:56:07.000+00:00",
  "duration_lte" : 6.027456183070403,
  "Pool" : [ "Pool", "Pool" ],
  "end_date_gte" : "2000-01-23T04:56:07.000+00:00",
  "start_date_lte" : "2000-01-23T04:56:07.000+00:00",
  "Queue" : [ "Queue", "Queue" ],
  "dag_ids" : [ "dag_ids", "dag_ids" ]
}
        response = self.client.open(
            '/api/v1/dags/~/dagRuns/~/taskInstances/list',
            method='POST',
            data=json.dumps(body),
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
