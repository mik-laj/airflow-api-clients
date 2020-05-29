# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from app.openapi_server.models.task_instance import TaskInstance  # noqa: F401,E501
from openapi_server import util


class TaskInstanceCollection(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, task_instances: List[TaskInstance]=None):  # noqa: E501
        """TaskInstanceCollection - a model defined in Swagger

        :param task_instances: The task_instances of this TaskInstanceCollection.  # noqa: E501
        :type task_instances: List[TaskInstance]
        """
        self.swagger_types = {
            'task_instances': List[TaskInstance]
        }

        self.attribute_map = {
            'task_instances': 'task_instances'
        }

        self._task_instances = task_instances

    @classmethod
    def from_dict(cls, dikt) -> 'TaskInstanceCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The TaskInstanceCollection of this TaskInstanceCollection.  # noqa: E501
        :rtype: TaskInstanceCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def task_instances(self) -> List[TaskInstance]:
        """Gets the task_instances of this TaskInstanceCollection.


        :return: The task_instances of this TaskInstanceCollection.
        :rtype: List[TaskInstance]
        """
        return self._task_instances

    @task_instances.setter
    def task_instances(self, task_instances: List[TaskInstance]):
        """Sets the task_instances of this TaskInstanceCollection.


        :param task_instances: The task_instances of this TaskInstanceCollection.
        :type task_instances: List[TaskInstance]
        """

        self._task_instances = task_instances
