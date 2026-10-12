package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cupcake") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,22.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,4.0f)
                lineTo(15.0f,4.0f)
                curveTo(16.656855f,4.0f,18.0f,5.343146f,18.0f,7.0f)
                lineTo(17.996f,7.125f)
                curveTo(19.764389f,7.579649f,21.00045f,9.174102f,21.0f,11.0f)
                lineTo(21.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.5f,22.0f)
                lineTo(17.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.0f,13.0f)
                curveTo(21.33614f,13.000037f,21.649773f,13.16895f,21.834785f,13.449592f)
                curveTo(22.0198f,13.730232f,22.05144f,14.085051f,21.919f,14.394f)
                lineTo(19.179f,20.788f)
                curveTo(18.863691f,21.523542f,18.140276f,22.000313f,17.34f,22.0f)
                lineTo(6.659f,22.0f)
                curveTo(5.859088f,21.999912f,5.1361656f,21.523207f,4.821f,20.788f)
                lineTo(2.081f,14.394f)
                curveTo(1.9485613f,14.085052f,1.9802011f,13.730233f,2.1652148f,13.449592f)
                curveTo(2.3502285f,13.168951f,2.663861f,13.000037f,3.0f,13.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3.0f,13.0f)
                lineTo(3.0f,11.0f)
                curveTo(2.9994326f,9.17439f,4.2350082f,7.580033f,6.0030003f,7.125f)
                lineTo(6.0f,7.0f)
                curveTo(6.0f,5.343146f,7.343146f,4.0f,9.0f,4.0f)
                lineTo(10.0f,4.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f,22.0f)
                lineTo(7.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(10.0f,4.0f)
                curveTo(9.996795f,4.716662f,10.377291f,5.3802605f,10.997409f,5.7395196f)
                curveTo(11.617528f,6.098779f,12.382472f,6.098779f,13.002591f,5.7395196f)
                curveTo(13.622709f,5.3802605f,14.003205f,4.716662f,14.0f,4.0f)
                curveTo(14.003205f,3.283338f,13.622709f,2.6197395f,13.002591f,2.2604802f)
                curveTo(12.382472f,1.9012209f,11.617528f,1.9012209f,10.997409f,2.2604802f)
                curveTo(10.377291f,2.6197395f,9.996795f,3.283338f,10.0f,4.0f)
            }
}

public val LucideIcons.All.CupcakeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cupcake: ImageVector
    @Composable get() = CupcakeDefinition.asImageVector()
