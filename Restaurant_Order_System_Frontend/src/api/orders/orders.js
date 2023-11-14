import request from '@/utils/request'

// 查询Order List列表
export function listOrders(query) {
  return request({
    url: '/orders/orders/list',
    method: 'get',
    params: query
  })
}

// 查询Order List详细
export function getOrders(orderId) {
  return request({
    url: '/orders/orders/' + orderId,
    method: 'get'
  })
}

// 新增Order List
export function addOrders(data) {
  return request({
    url: '/orders/orders',
    method: 'post',
    data: data
  })
}

// 修改Order List
export function updateOrders(data) {
  return request({
    url: '/orders/orders',
    method: 'put',
    data: data
  })
}

// 删除Order List
export function delOrders(orderId) {
  return request({
    url: '/orders/orders/' + orderId,
    method: 'delete'
  })
}
