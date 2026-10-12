package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.852f,19.772f)
                lineTo(10.469f,20.696f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.148f,14.228f)
                lineTo(13.531f,13.304999f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.148f,19.772f)
                curveTo(14.143133f,19.365078f,14.844477f,18.456806f,14.986462f,17.391106f)
                curveTo(15.128447f,16.325405f,14.689368f,15.265193f,13.835487f,14.611923f)
                curveTo(12.981606f,13.958653f,11.843453f,13.812193f,10.851999f,14.227999f)
                lineTo(10.468999f,13.304998f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.53f,20.696f)
                lineTo(13.148f,19.772f)
                curveTo(12.156546f,20.187805f,11.0183935f,20.041344f,10.164512f,19.388075f)
                curveTo(9.310631f,18.734804f,8.871552f,17.674593f,9.013537f,16.608892f)
                curveTo(9.155522f,15.543193f,9.856866f,14.634921f,10.851999f,14.227999f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.772f,15.852f)
                lineTo(15.695001f,15.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(14.772f,18.148f)
                lineTo(15.695001f,18.531f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.2f,15.1f)
                curveTo(2.3400245f,13.346587f,1.5836911f,10.718749f,2.2269812f,8.244857f)
                curveTo(2.8702712f,5.770965f,4.8108883f,3.844419f,7.2893963f,3.2191486f)
                curveTo(9.767904f,2.5938785f,12.390169f,3.3693147f,14.13f,5.2420006f)
                curveTo(14.861183f,6.0280166f,15.401785f,6.971675f,15.71f,8.0f)
                lineTo(17.5f,8.0f)
                curveTo(19.457226f,8.026385f,21.172909f,9.314955f,21.743738f,11.187275f)
                curveTo(22.314568f,13.059596f,21.6096f,15.086169f,20.0f,16.2f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.228f,15.852f)
                lineTo(8.304999f,15.469f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.228f,18.148f)
                lineTo(8.304999f,18.531f)
            }
}

public val LucideIcons.All.CloudCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudCog: ImageVector
    @Composable get() = CloudCogDefinition.asImageVector()
