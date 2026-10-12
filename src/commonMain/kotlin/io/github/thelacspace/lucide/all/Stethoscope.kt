package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Stethoscope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.0f,2.0f)
                lineTo(11.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,2.0f)
                lineTo(5.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(4.0f,3.0f)
                curveTo(2.8954306f,3.0f,2.0f,3.8954306f,2.0f,5.0f)
                lineTo(2.0f,9.0f)
                curveTo(2.0147727f,12.303234f,4.6967325f,14.9732275f,8.0f,14.9732275f)
                curveTo(11.3032675f,14.9732275f,13.985228f,12.303234f,14.0f,9.0f)
                lineTo(14.0f,5.0f)
                curveTo(14.0f,3.8954306f,13.104569f,3.0f,12.0f,3.0f)
                lineTo(11.0f,3.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,15.0f)
                curveTo(8.014772f,18.303234f,10.6967325f,20.973227f,14.0f,20.973227f)
                curveTo(17.303268f,20.973227f,19.985228f,18.303234f,20.0f,15.0f)
                lineTo(20.0f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,10.0f)
                curveTo(17.996796f,10.716661f,18.37729f,11.38026f,18.99741f,11.73952f)
                curveTo(19.617527f,12.098779f,20.382473f,12.098779f,21.00259f,11.73952f)
                curveTo(21.62271f,11.38026f,22.003204f,10.716661f,22.0f,10.0f)
                curveTo(22.003204f,9.283339f,21.62271f,8.61974f,21.00259f,8.26048f)
                curveTo(20.382473f,7.901221f,19.617527f,7.901221f,18.99741f,8.26048f)
                curveTo(18.37729f,8.61974f,17.996796f,9.283339f,18.0f,10.0f)
            }
}

public val LucideIcons.All.StethoscopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Stethoscope: ImageVector
    @Composable get() = StethoscopeDefinition.asImageVector()
