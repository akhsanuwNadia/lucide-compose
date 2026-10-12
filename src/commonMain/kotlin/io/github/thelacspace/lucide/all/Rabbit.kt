package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Rabbit") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.0f,16.0f)
                curveTo(14.183766f,15.998447f,15.257765f,16.69315f,15.741744f,17.773458f)
                curveTo(16.225723f,18.85377f,16.029179f,20.117672f,15.24f,21.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,12.0f)
                lineTo(18.01f,12.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0f,21.0f)
                lineTo(10.0f,21.0f)
                curveTo(7.790861f,21.0f,6.0f,19.209139f,6.0f,17.0f)
                curveTo(6.0f,13.1340065f,9.1340065f,10.0f,13.0f,10.0f)
                lineTo(13.2f,10.0f)
                lineTo(9.6f,6.4f)
                curveTo(9.096093f,5.9005804f,8.897922f,5.1697145f,9.080523f,4.48415f)
                curveTo(9.263124f,3.7985852f,9.798586f,3.2631242f,10.48415f,3.0805225f)
                curveTo(11.169715f,2.897921f,11.90058f,3.0960932f,12.400001f,3.6000001f)
                lineTo(15.8f,7.0f)
                lineTo(16.0f,7.0f)
                curveTo(19.3f,7.0f,22.0f,9.7f,22.0f,13.0f)
                lineTo(22.0f,14.0f)
                curveTo(22.0f,15.104569f,21.10457f,16.0f,20.0f,16.0f)
                lineTo(19.0f,16.0f)
                curveTo(17.343145f,16.0f,16.0f,17.343145f,16.0f,19.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0f,8.54f)
                lineTo(20.0f,4.0f)
                curveTo(20.003204f,3.283338f,19.62271f,2.6197395f,19.00259f,2.2604802f)
                curveTo(18.382473f,1.9012209f,17.617527f,1.9012209f,16.99741f,2.2604802f)
                curveTo(16.37729f,2.6197395f,15.996795f,3.283338f,16.0f,4.0f)
                lineTo(16.0f,7.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(7.612f,12.524f)
                curveTo(6.8294554f,11.139048f,5.101947f,10.60568f,3.6748343f,11.308404f)
                curveTo(2.2477214f,12.0111265f,1.6172206f,13.705599f,2.2378592f,15.170276f)
                curveTo(2.8584976f,16.634953f,4.514476f,17.360558f,6.012f,16.824001f)
            }
}

public val LucideIcons.All.RabbitDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Rabbit: ImageVector
    @Composable get() = RabbitDefinition.asImageVector()
