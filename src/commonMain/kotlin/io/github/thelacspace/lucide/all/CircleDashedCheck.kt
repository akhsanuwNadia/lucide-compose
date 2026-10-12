package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDashedCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f,2.182f)
                curveTo(11.355024f,1.9391211f,12.644977f,1.9391211f,13.900001f,2.182f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f,21.818f)
                curveTo(12.644976f,22.060879f,11.355023f,22.060879f,10.099999f,21.818f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,9.0f)
                lineTo(10.5f,14.5f)
                lineTo(8.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.609f,3.721f)
                curveTo(18.67047f,4.440223f,19.58372f,5.3568687f,20.299f,6.421f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.182f,13.9f)
                curveTo(1.9391211f,12.644976f,1.9391211f,11.355023f,2.182f,10.099999f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.279f,17.609f)
                curveTo(19.559776f,18.67047f,18.64313f,19.58372f,17.578999f,20.299f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.818f,10.1f)
                curveTo(22.060879f,11.355024f,22.060879f,12.644977f,21.818f,13.900001f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.721f,6.391f)
                curveTo(4.440223f,5.32953f,5.3568687f,4.4162793f,6.421f,3.7009997f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.391f,20.279f)
                curveTo(5.32953f,19.559776f,4.4162793f,18.64313f,3.7009997f,17.578999f)
            }
}

public val LucideIcons.All.CircleDashedCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDashedCheck: ImageVector
    @Composable get() = CircleDashedCheckDefinition.asImageVector()
