package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShieldCogCorner") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,22.0f)
                curveTo(7.1940002f,20.55f,4.0f,18.034f,4.0f,13.0f)
                lineTo(4.0f,6.0f)
                curveTo(4.0f,5.4477153f,4.4477153f,5.0f,5.0f,5.0f)
                curveTo(7.0f,5.0f,9.5f,3.8f,11.24f,2.28f)
                curveTo(11.677673f,1.906067f,12.322327f,1.906067f,12.76f,2.28f)
                curveTo(14.51f,3.81f,17.0f,5.0f,19.0f,5.0f)
                curveTo(19.552284f,5.0f,20.0f,5.4477153f,20.0f,6.0f)
                lineTo(20.0f,10.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.923f,16.547f)
                lineTo(14.0f,16.164f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.923f,18.843f)
                lineTo(14.0f,19.226f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.547f,14.923f)
                lineTo(16.164f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.547f,20.467f)
                lineTo(16.164001f,21.390999f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.843f,14.923f)
                lineTo(19.226f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(19.225f,21.391f)
                lineTo(18.843f,20.467001f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.467f,16.547f)
                lineTo(21.39f,16.164001f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.467f,18.843f)
                lineTo(21.39f,19.226f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.695f,17.695f)
                curveTo(14.690192f,18.769993f,15.260935f,19.76539f,16.191113f,20.30428f)
                curveTo(17.121292f,20.843168f,18.268707f,20.843168f,19.198887f,20.30428f)
                curveTo(20.129065f,19.76539f,20.699808f,18.769993f,20.695f,17.695f)
                curveTo(20.699808f,16.620007f,20.129065f,15.624609f,19.198887f,15.08572f)
                curveTo(18.268707f,14.546831f,17.121292f,14.546831f,16.191113f,15.08572f)
                curveTo(15.260935f,15.624609f,14.690192f,16.620007f,14.695f,17.695f)
            }
}

public val LucideIcons.All.ShieldCogCornerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShieldCogCorner: ImageVector
    @Composable get() = ShieldCogCornerDefinition.asImageVector()
