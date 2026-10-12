package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BeerOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,13.0f)
                lineTo(13.0f,18.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,11.47f)
                lineTo(17.0f,8.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,11.0f)
                lineTo(18.0f,11.0f)
                curveTo(19.014133f,10.999905f,19.959665f,11.512174f,20.51347f,12.361743f)
                curveTo(21.067272f,13.211313f,21.154371f,14.283164f,20.744999f,15.211f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0f,2.0f)
                lineTo(22.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,8.0f)
                lineTo(5.0f,20.0f)
                curveTo(5.0f,21.10457f,5.8954306f,22.0f,7.0f,22.0f)
                lineTo(15.0f,22.0f)
                curveTo(16.10457f,22.0f,17.0f,21.10457f,17.0f,20.0f)
                lineTo(17.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.536f,7.535f)
                curveTo(6.766f,7.649f,6.154f,8.0f,5.5f,8.0f)
                curveTo(4.4886994f,8.000189f,3.5768943f,7.391081f,3.1898608f,6.456772f)
                curveTo(2.8028274f,5.5224624f,3.016808f,4.447003f,3.7319999f,3.7319999f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.727f,3.204f)
                curveTo(9.306f,2.767f,9.885f,2.0f,11.0f,2.0f)
                curveTo(12.559999f,2.0f,13.0f,3.5f,14.0f,3.5f)
                curveTo(15.0f,3.5f,15.72f,3.0f,16.5f,3.0f)
                curveTo(17.395828f,2.9959936f,18.225325f,3.471613f,18.6744f,4.2467613f)
                curveTo(19.123474f,5.0219097f,19.123474f,5.9780903f,18.6744f,6.7532387f)
                curveTo(18.225325f,7.528387f,17.395828f,8.004006f,16.5f,8.0f)
                curveTo(15.72f,8.0f,15.0f,7.5f,14.0f,7.5f)
                curveTo(13.7151985f,7.501739f,13.431949f,7.542107f,13.158f,7.62f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,14.6f)
                lineTo(9.0f,18.0f)
            }
}

public val LucideIcons.All.BeerOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BeerOff: ImageVector
    @Composable get() = BeerOffDefinition.asImageVector()
