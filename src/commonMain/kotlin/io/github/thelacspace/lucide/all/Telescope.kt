package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Telescope") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.065f,12.493f)
                lineTo(3.8849998f,13.811f)
                curveTo(3.3858469f,13.919328f,2.8922532f,13.6066f,2.7769997f,13.109f)
                lineTo(2.2399998f,10.959f)
                curveTo(2.1091607f,10.422168f,2.4085944f,9.874001f,2.9309998f,9.693999f)
                lineTo(16.435f,5.253999f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.56f,11.747f)
                lineTo(17.892f,10.823f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,21.0f)
                lineTo(12.895f,14.79f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.485f,5.94f)
                curveTo(16.217316f,4.8685937f,16.868673f,3.7829993f,17.94f,3.515f)
                lineTo(19.03f,3.243f)
                curveTo(19.565386f,3.1094444f,20.107769f,3.4347847f,20.242f,3.97f)
                lineTo(21.757f,10.03f)
                curveTo(21.89119f,10.565714f,21.565708f,11.108782f,21.03f,11.243f)
                lineTo(19.94f,11.515f)
                curveTo(18.868595f,11.782684f,17.783f,11.131328f,17.515001f,10.06f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(6.158f,8.633f)
                lineTo(7.272f,13.089001f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(11.105f,14.79f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,13.0f)
                curveTo(9.996795f,13.716661f,10.377291f,14.38026f,10.997409f,14.73952f)
                curveTo(11.617528f,15.098779f,12.382472f,15.098779f,13.002591f,14.73952f)
                curveTo(13.622709f,14.38026f,14.003205f,13.716661f,14.0f,13.0f)
                curveTo(14.003205f,12.283339f,13.622709f,11.61974f,13.002591f,11.26048f)
                curveTo(12.382472f,10.901221f,11.617528f,10.901221f,10.997409f,11.26048f)
                curveTo(10.377291f,11.61974f,9.996795f,12.283339f,10.0f,13.0f)
            }
}

public val LucideIcons.All.TelescopeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Telescope: ImageVector
    @Composable get() = TelescopeDefinition.asImageVector()
