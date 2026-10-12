package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Metronome") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,11.4f)
                lineTo(12.0f,9.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0f,17.0f)
                lineTo(18.59f,10.41f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.05f,5.7f)
                lineTo(14.832f,5.009f)
                curveTo(14.410795f,3.80585f,13.275248f,3.0002654f,12.0005f,3.0002654f)
                curveTo(10.725752f,3.0002654f,9.590204f,3.80585f,9.169f,5.009f)
                lineTo(4.418f,19.695f)
                curveTo(4.320614f,19.999084f,4.374295f,20.331394f,4.562474f,20.58935f)
                curveTo(4.7506523f,20.847303f,5.0507007f,20.999887f,5.37f,21.0f)
                lineTo(18.623001f,21.0f)
                curveTo(18.943335f,21.000084f,19.24432f,20.846703f,19.432508f,20.587475f)
                curveTo(19.620695f,20.328245f,19.673306f,19.994553f,19.574001f,19.69f)
                lineTo(18.45f,16.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,9.0f)
                curveTo(17.996796f,9.716661f,18.37729f,10.38026f,18.99741f,10.73952f)
                curveTo(19.617527f,11.098779f,20.382473f,11.098779f,21.00259f,10.73952f)
                curveTo(21.62271f,10.38026f,22.003204f,9.716661f,22.0f,9.0f)
                curveTo(22.003204f,8.283339f,21.62271f,7.6197395f,21.00259f,7.2604804f)
                curveTo(20.382473f,6.901221f,19.617527f,6.901221f,18.99741f,7.2604804f)
                curveTo(18.37729f,7.6197395f,17.996796f,8.283339f,18.0f,9.0f)
            }
}

public val LucideIcons.All.MetronomeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Metronome: ImageVector
    @Composable get() = MetronomeDefinition.asImageVector()
