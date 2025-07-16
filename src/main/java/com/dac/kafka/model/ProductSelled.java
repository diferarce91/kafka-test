package com.dac.kafka.model;

import lombok.Builder;

@Builder
public record ProductSelled(String sku, Integer price, Integer quantity) implements IPublishable, IReadable {
}
