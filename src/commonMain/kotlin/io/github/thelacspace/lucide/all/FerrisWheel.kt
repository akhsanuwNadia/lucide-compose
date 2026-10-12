package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FerrisWheel") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,2.0f)
                lineTo(12.0f,6.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.8f,15.0f)
                lineTo(3.3000002f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.7f,7.0f)
                lineTo(17.2f,9.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.8f,9.0f)
                lineTo(3.3f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.7f,17.0f)
                lineTo(17.2f,15.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,22.0f)
                lineTo(12.0f,14.0f)
                lineTo(15.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,22.0f)
                lineTo(16.0f,22.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,18.7f)
                curveTo(20.781328f,16.212305f,21.739048f,12.266304f,20.40755f,8.780398f)
                curveTo(19.076054f,5.2944922f,15.7315445f,2.9917967f,12.0f,2.9917967f)
                curveTo(8.2684555f,2.9917967f,4.9239464f,5.2944922f,3.5924487f,8.780398f)
                curveTo(2.2609513f,12.266304f,3.2186708f,16.212305f,6.0f,18.7f)
            }
}

public val LucideIcons.All.FerrisWheelDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FerrisWheel: ImageVector
    @Composable get() = FerrisWheelDefinition.asImageVector()
