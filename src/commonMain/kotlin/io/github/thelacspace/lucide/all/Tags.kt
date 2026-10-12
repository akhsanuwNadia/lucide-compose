package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Tags") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.172f,2.0f)
                curveTo(13.70239f,2.0001132f,14.211015f,2.210901f,14.586f,2.586f)
                lineTo(21.296001f,9.296f)
                curveTo(21.75035f,9.746639f,22.005917f,10.360069f,22.005917f,11.0f)
                curveTo(22.005917f,11.63993f,21.75035f,12.25336f,21.296001f,12.7039995f)
                lineTo(16.704002f,17.296f)
                curveTo(16.253363f,17.750349f,15.639933f,18.005915f,15.000002f,18.005915f)
                curveTo(14.360072f,18.005915f,13.746642f,17.750349f,13.296002f,17.296f)
                lineTo(6.5860023f,10.5859995f)
                curveTo(6.2109027f,10.211015f,6.000114f,9.70239f,6.0f,9.172f)
                lineTo(6.0f,3.0f)
                curveTo(6.0f,2.4477153f,6.4477153f,2.0f,7.0f,2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,7.0f)
                lineTo(2.0f,13.172f)
                curveTo(2.0001132f,13.70239f,2.210901f,14.211015f,2.586f,14.586f)
                lineTo(9.296f,21.296001f)
                curveTo(10.15581f,22.162464f,11.529027f,22.24552f,12.4869995f,21.489002f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,6.5f)
                curveTo(9.999199f,6.6791654f,10.094322f,6.845065f,10.249352f,6.93488f)
                curveTo(10.404382f,7.024695f,10.595618f,7.024695f,10.750648f,6.93488f)
                curveTo(10.905678f,6.845065f,11.000801f,6.6791654f,11.0f,6.5f)
                curveTo(11.000801f,6.3208346f,10.905678f,6.154935f,10.750648f,6.06512f)
                curveTo(10.595618f,5.975305f,10.404382f,5.975305f,10.249352f,6.06512f)
                curveTo(10.094322f,6.154935f,9.999199f,6.3208346f,10.0f,6.5f)
            }
}

public val LucideIcons.All.TagsDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Tags: ImageVector
    @Composable get() = TagsDefinition.asImageVector()
