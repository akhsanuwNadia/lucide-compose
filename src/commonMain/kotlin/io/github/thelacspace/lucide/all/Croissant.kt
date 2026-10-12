package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Croissant") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.2f,18.0f)
                lineTo(4.774f,18.0f)
                curveTo(4.1688633f,17.97918f,3.6355839f,17.596575f,3.4220002f,17.03f)
                curveTo(2.8127685f,14.90358f,2.8587701f,12.642879f,3.5540001f,10.543001f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,10.2f)
                lineTo(18.0f,4.774f)
                curveTo(17.97918f,4.1688633f,17.596575f,3.6355839f,17.03f,3.4220002f)
                curveTo(14.903892f,2.8129745f,12.643571f,2.8589754f,10.544001f,3.5540001f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,5.0f)
                curveTo(20.209139f,5.0f,22.0f,6.343146f,22.0f,8.0f)
                curveTo(22.0f,9.104569f,21.10457f,10.0f,20.0f,10.0f)
                curveTo(18.19006f,9.999547f,16.413929f,10.490325f,14.861f,11.42f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,18.0f)
                curveTo(5.0f,20.209139f,6.343146f,22.0f,8.0f,22.0f)
                curveTo(9.104569f,22.0f,10.0f,21.10457f,10.0f,20.0f)
                curveTo(9.999366f,18.18972f,10.49015f,16.413221f,11.42f,14.860001f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.709f,2.554f)
                curveTo(5.825177f,3.5582778f,3.5582776f,5.825177f,2.5539994f,8.709f)
                curveTo(2.4040117f,9.340156f,2.6767614f,9.996206f,3.2299995f,10.335f)
                lineTo(13.037f,15.755f)
                curveTo(13.817144f,16.186321f,14.788566f,16.049252f,15.418908f,15.418909f)
                curveTo(16.04925f,14.788567f,16.18632f,13.817145f,15.754999f,13.037001f)
                lineTo(10.334999f,3.2300005f)
                curveTo(9.996205f,2.6767623f,9.340155f,2.4040127f,8.708999f,2.5540004f)
            }
}

public val LucideIcons.All.CroissantDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Croissant: ImageVector
    @Composable get() = CroissantDefinition.asImageVector()
