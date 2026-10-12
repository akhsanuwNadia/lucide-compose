package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Vault") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                lineTo(19.0f,3.0f)
                lineTo(21.0f,3.0f)
                lineTo(21.0f,21.0f)
                lineTo(19.0f,21.0f)
                lineTo(5.0f,21.0f)
                lineTo(3.0f,21.0f)
                lineTo(3.0f,3.0f)
                lineTo(5.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,7.5f)
                curveTo(6.999199f,7.6791654f,7.0943227f,7.845065f,7.2493525f,7.93488f)
                curveTo(7.4043818f,8.024694f,7.5956182f,8.024694f,7.7506475f,7.93488f)
                curveTo(7.9056773f,7.845065f,8.000801f,7.6791654f,8.0f,7.5f)
                curveTo(8.000801f,7.3208346f,7.9056773f,7.154935f,7.7506475f,7.06512f)
                curveTo(7.5956182f,6.975305f,7.4043818f,6.975305f,7.2493525f,7.06512f)
                curveTo(7.0943227f,7.154935f,6.999199f,7.3208346f,7.0f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.9f,7.9f)
                lineTo(10.6f,10.6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,7.5f)
                curveTo(15.999199f,7.6791654f,16.094322f,7.845065f,16.249352f,7.93488f)
                curveTo(16.404383f,8.024694f,16.595617f,8.024694f,16.750648f,7.93488f)
                curveTo(16.905678f,7.845065f,17.000801f,7.6791654f,17.0f,7.5f)
                curveTo(17.000801f,7.3208346f,16.905678f,7.154935f,16.750648f,7.06512f)
                curveTo(16.595617f,6.975305f,16.404383f,6.975305f,16.249352f,7.06512f)
                curveTo(16.094322f,7.154935f,15.999199f,7.3208346f,16.0f,7.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.4f,10.6f)
                lineTo(16.1f,7.9000006f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.0f,16.5f)
                curveTo(6.999199f,16.679165f,7.0943227f,16.845064f,7.2493525f,16.93488f)
                curveTo(7.4043818f,17.024694f,7.5956182f,17.024694f,7.7506475f,16.93488f)
                curveTo(7.9056773f,16.845064f,8.000801f,16.679165f,8.0f,16.5f)
                curveTo(8.000801f,16.320835f,7.9056773f,16.154936f,7.7506475f,16.06512f)
                curveTo(7.5956182f,15.975306f,7.4043818f,15.975306f,7.2493525f,16.06512f)
                curveTo(7.0943227f,16.154936f,6.999199f,16.320835f,7.0f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.9f,16.1f)
                lineTo(10.6f,13.400001f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.0f,16.5f)
                curveTo(15.999199f,16.679165f,16.094322f,16.845064f,16.249352f,16.93488f)
                curveTo(16.404383f,17.024694f,16.595617f,17.024694f,16.750648f,16.93488f)
                curveTo(16.905678f,16.845064f,17.000801f,16.679165f,17.0f,16.5f)
                curveTo(17.000801f,16.320835f,16.905678f,16.154936f,16.750648f,16.06512f)
                curveTo(16.595617f,15.975306f,16.404383f,15.975306f,16.249352f,16.06512f)
                curveTo(16.094322f,16.154936f,15.999199f,16.320835f,16.0f,16.5f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.4f,13.4f)
                lineTo(16.1f,16.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,12.0f)
                curveTo(9.996795f,12.716661f,10.377291f,13.38026f,10.997409f,13.73952f)
                curveTo(11.617528f,14.098779f,12.382472f,14.098779f,13.002591f,13.73952f)
                curveTo(13.622709f,13.38026f,14.003205f,12.716661f,14.0f,12.0f)
                curveTo(14.003205f,11.283339f,13.622709f,10.61974f,13.002591f,10.26048f)
                curveTo(12.382472f,9.901221f,11.617528f,9.901221f,10.997409f,10.26048f)
                curveTo(10.377291f,10.61974f,9.996795f,11.283339f,10.0f,12.0f)
            }
}

public val LucideIcons.All.VaultDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Vault: ImageVector
    @Composable get() = VaultDefinition.asImageVector()
