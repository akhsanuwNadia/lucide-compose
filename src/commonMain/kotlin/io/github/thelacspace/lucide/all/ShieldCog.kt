package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.929f,14.467f)
                lineTo(10.546f,15.391f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.929f,8.923f)
                lineTo(10.546f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.225f,8.923f)
                lineTo(13.608f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.607f,15.391f)
                lineTo(13.225f,14.467f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.849f,10.547f)
                lineTo(15.772f,10.164f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.849f,12.843f)
                lineTo(15.772f,13.226001f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,13.0f)
                curveTo(20.0f,18.0f,16.5f,20.5f,12.34f,21.95f)
                curveTo(12.122163f,22.023819f,11.885537f,22.020287f,11.67f,21.94f)
                curveTo(7.5f,20.5f,4.0f,18.0f,4.0f,13.0f)
                lineTo(4.0f,6.0f)
                curveTo(4.0f,5.4477153f,4.4477153f,5.0f,5.0f,5.0f)
                curveTo(7.0f,5.0f,9.5f,3.8f,11.24f,2.28f)
                curveTo(11.677673f,1.906067f,12.322327f,1.906067f,12.76f,2.28f)
                curveTo(14.51f,3.81f,17.0f,5.0f,19.0f,5.0f)
                curveTo(19.552284f,5.0f,20.0f,5.4477153f,20.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(9.305f,10.547f)
                lineTo(8.382f,10.164f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.305f,12.843f)
                lineTo(8.382f,13.226001f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.077f,11.695f)
                curveTo(9.072192f,12.769993f,9.642935f,13.76539f,10.573113f,14.304279f)
                curveTo(11.503291f,14.843168f,12.650708f,14.843168f,13.580886f,14.304279f)
                curveTo(14.511065f,13.76539f,15.081807f,12.769993f,15.077f,11.695f)
                curveTo(15.081807f,10.620007f,14.511065f,9.624609f,13.580886f,9.08572f)
                curveTo(12.650708f,8.546831f,11.503291f,8.546831f,10.573113f,9.08572f)
                curveTo(9.642935f,9.624609f,9.072192f,10.620007f,9.077f,11.695f)
            }
}

public val LucideIcons.All.ShieldCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldCog: ImageVector
    @Composable get() = ShieldCogDefinition.asImageVector()
