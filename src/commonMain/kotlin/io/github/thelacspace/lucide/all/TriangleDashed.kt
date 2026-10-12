package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TriangleDashed") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.17f,4.193f)
                curveTo(10.49069f,3.4653018f,11.212033f,2.99673f,12.007256f,2.9995499f)
                curveTo(12.802478f,3.0023699f,13.520479f,3.4760458f,13.836f,4.206f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.0f,21.0f)
                lineTo(16.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.874f,7.743f)
                lineTo(16.874f,9.475f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.849f,12.952f)
                lineTo(19.849f,14.684f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.824f,18.18f)
                curveTo(22.10481f,18.80101f,22.050049f,19.522272f,21.6787f,20.093767f)
                curveTo(21.307348f,20.665262f,20.670532f,21.00831f,19.988998f,21.004f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.024f,21.0f)
                curveTo(3.3376138f,21.008083f,2.6950376f,20.663599f,2.3218455f,20.087475f)
                curveTo(1.9486535f,19.51135f,1.8969933f,18.784092f,2.1850002f,18.161f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.136f,12.952f)
                lineTo(4.136f,14.684f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.0f,21.0f)
                lineTo(10.0f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.102f,7.743f)
                lineTo(7.102f,9.475f)
            }
}

public val LucideIcons.All.TriangleDashedDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TriangleDashed: ImageVector
    @Composable get() = TriangleDashedDefinition.asImageVector()
