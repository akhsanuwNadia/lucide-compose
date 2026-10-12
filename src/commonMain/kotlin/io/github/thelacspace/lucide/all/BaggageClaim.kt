package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BaggageClaim") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(22.0f,18.0f)
                lineTo(6.0f,18.0f)
                curveTo(4.8954306f,18.0f,4.0f,17.10457f,4.0f,16.0f)
                lineTo(4.0f,7.0f)
                curveTo(4.0f,5.8954306f,3.1045694f,5.0f,2.0f,5.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.0f,14.0f)
                lineTo(17.0f,4.0f)
                curveTo(17.0f,2.8954306f,16.10457f,2.0f,15.0f,2.0f)
                lineTo(14.0f,2.0f)
                curveTo(12.895431f,2.0f,12.0f,2.8954306f,12.0f,4.0f)
                lineTo(12.0f,14.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,6.0f)
                lineTo(20.0f,6.0f)
                lineTo(21.0f,6.0f)
                lineTo(21.0f,14.0f)
                lineTo(20.0f,14.0f)
                lineTo(9.0f,14.0f)
                lineTo(8.0f,14.0f)
                lineTo(8.0f,6.0f)
                lineTo(9.0f,6.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,20.0f)
                curveTo(15.996795f,20.716661f,16.37729f,21.38026f,16.99741f,21.73952f)
                curveTo(17.617527f,22.09878f,18.382473f,22.09878f,19.00259f,21.73952f)
                curveTo(19.62271f,21.38026f,20.003204f,20.716661f,20.0f,20.0f)
                curveTo(20.003204f,19.283339f,19.62271f,18.61974f,19.00259f,18.26048f)
                curveTo(18.382473f,17.90122f,17.617527f,17.90122f,16.99741f,18.26048f)
                curveTo(16.37729f,18.61974f,15.996795f,19.283339f,16.0f,20.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,20.0f)
                curveTo(6.996795f,20.716661f,7.3772902f,21.38026f,7.9974093f,21.73952f)
                curveTo(8.617528f,22.09878f,9.382472f,22.09878f,10.002591f,21.73952f)
                curveTo(10.622709f,21.38026f,11.003205f,20.716661f,11.0f,20.0f)
                curveTo(11.003205f,19.283339f,10.622709f,18.61974f,10.002591f,18.26048f)
                curveTo(9.382472f,17.90122f,8.617528f,17.90122f,7.9974093f,18.26048f)
                curveTo(7.3772902f,18.61974f,6.996795f,19.283339f,7.0f,20.0f)
            }
}

public val LucideIcons.All.BaggageClaimDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BaggageClaim: ImageVector
    @Composable get() = BaggageClaimDefinition.asImageVector()
