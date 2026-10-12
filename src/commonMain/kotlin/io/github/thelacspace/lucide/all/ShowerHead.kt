package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ShowerHead") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(4.0,4.0)
                lineTo(6.5,6.5)
            }
            lucidePath(strokeWidth) {
                moveTo(13.5,6.5)
                curveTo(11.561410903930664,4.600170135498047,8.45447063446045,4.615856170654297,6.535163402557373,6.535163402557373)
                curveTo(4.615856170654297,8.45447063446045,4.600170135498047,11.561410903930664,6.5,13.5)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,5.0)
                lineTo(5.0,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0,17.0)
                lineTo(14.0,17.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0,16.0)
                lineTo(10.0,16.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(13.0,13.0)
                lineTo(13.0,13.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0,10.0)
                lineTo(16.0,10.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,20.0)
                lineTo(11.0,20.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0,14.0)
                lineTo(17.0,14.010000228881836)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,11.0)
                lineTo(20.0,11.010000228881836)
            }
}

public val LucideIcons.All.ShowerHeadDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ShowerHead: ImageVector
    @Composable get() = ShowerHeadDefinition.asImageVector()
